package com.iluwatar.singleton;

/**
 * Thread-safe Singleton class.
 * This doesnt need synchronization, it is also singleton and also uses static factory innitialization.
 * Please note getInstance is not needed, but only there to ensure loozed coupling and adaptability with other 
 * codes.
 */
public enum ThreadSafeLazyLoadedIvoryTower {

  INSTANCE;

   
  /**
   * Note: This is not needed, you can call ThreadSafeLazyLoadedIvoryTower.INSTANCE which is the equivalent and 
   * elegant.
   */
  public  static ThreadSafeLazyLoadedIvoryTower getInstance() {
 

    return INSTANCE;
  }
}
