package org.example.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndSafe {

  public static void main(String[] args) {
    failSafeIterator();
//    failFastIterator();
  }
	
  private static void failSafeIterator() {
    String[] data = {"Tomcat", "Undertow", "Kubernetes", "JBoss"};
    List<String> servers = new CopyOnWriteArrayList<>(data);

      for (String server : servers) {
          System.out.println(server);
          servers.add("Jetty");
      }
  }

  private static void failFastIterator() {
    List<String> servers = new ArrayList<>();
    servers.add("Tomcat");
      for (String server : servers) {
          System.out.println(server);
           servers.add("Jetty");
      }
  }
}