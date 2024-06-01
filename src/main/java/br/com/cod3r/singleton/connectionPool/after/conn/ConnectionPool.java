package br.com.cod3r.singleton.connectionPool.after.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final ConnectionPool singleton = new ConnectionPool();
	private final static int POOL_SIZE = 2;
	private List<br.com.cod3r.singleton.connectionPool.after.conn.Connection> connectionsPool;

	public static ConnectionPool getInstance(){
		return singleton;
	}

	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<br.com.cod3r.singleton.connectionPool.after.conn.Connection>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new br.com.cod3r.singleton.connectionPool.after.conn.Connection());
		}
	}
	
	public br.com.cod3r.singleton.connectionPool.after.conn.Connection getConnection() {
		br.com.cod3r.singleton.connectionPool.after.conn.Connection avaiable = null;
		for(br.com.cod3r.singleton.connectionPool.after.conn.Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(br.com.cod3r.singleton.connectionPool.after.conn.Connection conn) {
		conn.setInUse(false);
	}
}
