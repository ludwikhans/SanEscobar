package gtruty.sanescobar.controller;

import gtruty.sanescobar.dao.VilageDao;
import gtruty.sanescobar.model.VilageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SelectVilageController {




    @GetMapping("/selectVilage")
    public String startPage(){



        return "selectVilage";
    }



}
