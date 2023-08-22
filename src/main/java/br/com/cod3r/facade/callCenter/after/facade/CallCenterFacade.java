package br.com.cod3r.facade.callCenter.after.facade;

import br.com.cod3r.facade.callCenter.after.model.Card;
import br.com.cod3r.facade.callCenter.after.model.Register;
import br.com.cod3r.facade.callCenter.after.services.*;

import java.util.List;

public class CallCenterFacade {

    private CardService cardService;

    private RegisterService registerService;

    private ReportService reportService;

    private PaymentService paymentService;

    private SecurityService securityService;

    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
        securityService = new SecurityService(cardService, registerService);
    }

    public Card getCardByUser(Long l) {
        return cardService.getCardByUser(l);
    }

    public void getSummary(Card card) {
        reportService.getSummary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        paymentService.getPaymentInfoByCard(card);
    }

    public void cancelLastRegister(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSummary(newCard);
    }

}