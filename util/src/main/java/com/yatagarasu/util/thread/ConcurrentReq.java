package com.yatagarasu.util.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentReq {
  private static final int THREAD_NUM = 5;
  private static final int MISSION_NUM = 10;

  public static void main(String[] args) {
    ExecutorService pool = Executors.newFixedThreadPool(THREAD_NUM);
    for (int i = 0; i < MISSION_NUM; i++) {
      MissionThread mission = new MissionThread();
      pool.execute(mission);
    }
    pool.shutdown();
  }

}
