package com.example.formation.Services;

import com.example.formation.Entities.Session;
import com.example.formation.Repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SessionService implements InterfSessionService{
    @Autowired
    SessionRepository sessionRepository;
    @Override
    public List<Session> getAllSessions() {
        List<Session> liste = (List<Session>) sessionRepository.findAll();
        return liste;}
    @Override
    public Session getSessionById(long id) {
        return sessionRepository.findById(id).get();}
    @Override
    public void addSession(Session session) {sessionRepository.save(session);}
    @Override
    public void deleteSession(long id) {sessionRepository.deleteById(id);}
}
