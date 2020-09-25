package com.comulynx.wallet.rest.api.controller;

import com.comulynx.wallet.rest.api.model.Webuser;
import com.comulynx.wallet.rest.api.repository.WebuserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class AuthController {

    private WebuserRepository webuserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthController(WebuserRepository webuserRepository, BCryptPasswordEncoder bCryptPasswordEncoder){
        this.webuserRepository = webuserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

//    @PostMapping("/sign-up")
//    public void signup(@RequestBody Webuser user){
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        webuserRepository.save(user);
//    }
}
