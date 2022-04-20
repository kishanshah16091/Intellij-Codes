package Class25;

public abstract class SmartWatch {

        //we can have instance variables in an abstract class
        private int RAM;
        protected int ROM;
        double displaySize;
        public String make;
        static boolean showTime=true;

        public SmartWatch(int RAM, int ROM, double displaySize, String make) {
            //alt+insert to generate
            this.RAM = RAM;
            this.ROM = ROM;
            this.displaySize = displaySize;
            this.make = make;
        }
        //1) access modifiers
        //2) non-access modifiers
        //3) return type
        //4) method name
        public  abstract void showHealthTips();
        public void updateOS(){
            checkOSUpdate();
            downloadUpdate();
            installUpdate();
            System.out.println("Updating the OS");
        }

        private void checkOSUpdate(){
            System.out.println("Checking if update is available");
        }
        private void downloadUpdate(){
            System.out.println("downloading the update ");
        }

        private void installUpdate(){
            System.out.println("installing the update ");
        }
        static void displayTime(){
            System.out.println("Displaying time");
        }

    }

    class AppleWatch extends SmartWatch{

        public AppleWatch(int RAM, int ROM, double displaySize, String make) {
            super(RAM, ROM, displaySize, make);
        }

        @Override
        public void showHealthTips() {
            System.out.println("use the Health App to check the details");
        }
    }