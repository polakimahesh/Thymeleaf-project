package com.example.Banking.Project.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/transactions")
    public String getAllTransaction(Model model){
        model.addAttribute("allTransaction",transactionService.getAllTransaction());
        model.addAttribute("template","transaction.html");
        model.addAttribute("title","Transaction");
        return "component";
    }
    @GetMapping("/providers")
    public String getProviders(Model model){
        model.addAttribute("template","provider.html");
        model.addAttribute("title","Providers");
        return "component";
    }

}
