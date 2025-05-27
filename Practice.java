interface USB {
   void connect();
   void disconnect();
}
class Mouse implements USB {
   public void connect() {
      System.out.println("connected");
   }
   public void disconnect() {
      System.out.println("disconnected");
   }
}
class Computer {
   public void useDevice(USB device) {
      device.connect();
      device.disconnect();
   }
}
