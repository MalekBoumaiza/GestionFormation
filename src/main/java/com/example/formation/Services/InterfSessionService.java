package com.example.formation.Services;

import com.example.formation.Entities.Salle;
import com.example.formation.Entities.Session;

import java.util.List;

public interface InterfSessionService {
    public List<Session> getAllSessions();
    public Session getSessionById(long id);
    public Session addSession(Session session);
    public Session updateSession(Long id, Session session);
    public void deleteSession(long id);
}
