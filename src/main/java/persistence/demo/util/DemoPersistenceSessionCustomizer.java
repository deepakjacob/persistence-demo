package persistence.demo.util;

import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.server.ConnectionPool;
import org.eclipse.persistence.sessions.server.ServerSession;

public class DemoPersistenceSessionCustomizer implements SessionCustomizer {
    public void customize(Session session) throws Exception {
        ServerSession serverSession = (ServerSession) session;
        int work = serverSession.getNumberOfActiveUnitsOfWork();
        ConnectionPool cPool = serverSession.getConnectionPool("default");
        int totalNumberOfConnections = cPool.getTotalNumberOfConnections();
        System.out.println("Details- NumberOfActiveUnitsOfWork : " + work + ", ConnectionPool size : " + totalNumberOfConnections );
    }
}