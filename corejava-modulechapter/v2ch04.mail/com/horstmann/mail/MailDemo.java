package com.horstmann.mail;

import module java.base;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import jakarta.mail.internet.MimeMessage.RecipientType;

/**
 * This program shows how to use JavaMail to send mail messages.
 */
class MailDemo {
    void main(String[] args) throws Exception {
        var props = new Properties();
        props.load(getClass().getResourceAsStream("mail.properties"));
        List<String> lines = Files.readAllLines(Path.of(args[0]));

        String from = lines.get(0);
        String to = lines.get(1);
        String subject = lines.get(2);

        var builder = new StringBuilder();
        for (int i = 3; i < lines.size(); i++) {
            builder.append(lines.get(i));
            builder.append("\n");
        }

        Console console = System.console();
        var password = new String(console.readPassword("Password: "));

        Session mailSession = Session.getDefaultInstance(props);
        // mailSession.setDebug(true);
        var message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);
        message.setText(builder.toString());
        Transport tr = mailSession.getTransport();
        try {
            tr.connect(null, password);
            tr.sendMessage(message, message.getAllRecipients());
        }
        finally {
            tr.close();
        }
    }
}
