package com.example.formation.Controllers;


import com.example.formation.Entities.Salle;
import com.example.formation.Entities.Session;
import com.example.formation.Services.SalleService;
import com.example.formation.Services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class SessionController {
    @Autowired
    SessionService sessionService;

    @GetMapping("/allSession")
    public List<Session> getAllSession() {
        List<Session> sess = sessionService.getAllSessions();
        return sess;
    }


    @GetMapping("/GetSessionById/{id}")
    public Session getSessionById(@PathVariable(value = "id") Long Id) {
        return sessionService.getSessionById(Id);
    }

    @PostMapping("/addSession")
    public Session createSession(@RequestBody Session session) {
        return sessionService.addSession(session);
    }

    @PutMapping("/updateSession/{id}")
    public Session updateSession(@PathVariable(value = "id") Long Id,
                             @RequestBody Session sessionDetails) {
        return sessionService.updateSession(Id, sessionDetails);
    }


    @DeleteMapping("/DeleteSession/{id}")
    public ResponseEntity<?> deleteSession(@PathVariable(value = "id") Long sessionId) {
        sessionService.deleteSession(sessionId);
        return ResponseEntity.ok().build();
    }
}
