package br.com.cod3r.facade.callCenter.before;

import br.com.cod3r.facade.callCenter.before.model.Card;
import br.com.cod3r.facade.callCenter.before.model.Register;
import br.com.cod3r.facade.callCenter.before.services.*;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        CardService cardService = new CardService();
        RegisterService registerService = new RegisterService();
        ReportService reportService = new ReportService(registerService);
        PaymentService paymentService = new PaymentService(registerService);
        SecurityService securityService = new SecurityService(cardService, registerService);

        System.out.println();

        Card card = cardService.getCardByUser(123456L);
        System.out.println(card);

        reportService.getSumary(card);

        paymentService.getPaymentInfoByCard(card);

        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
    }

}