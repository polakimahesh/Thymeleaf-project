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
        return "transaction";
    }
    @GetMapping("/providers")
    public String getProviders(){
        return "provider";
    }

}
