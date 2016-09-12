package com.yatagarasu.util.thread;

public class MissionThread implements Runnable {

  public void run() {
    System.out.println(Thread.currentThread().getName()+" running..");
  }
  
}
