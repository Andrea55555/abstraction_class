package com.company;

public class Main {

    public interface Cars {
        void passenger_Capacity();

        void weight();

        void year_Of_Issue();
    }

    public abstract class passenger_Car implements Cars {
        @Override
        public void passenger_Capacity() {
            System.out.println("2-7person");
        }

        @Override
        public void weight() {
            System.out.println("0.5-2ton");
        }

        public abstract void year_Of_Issue();
    }
        public abstract class trucks implements Cars {
            @Override
            public void passenger_Capacity() {
                System.out.println("1-5person");
            }

            @Override
            public void weight() {
                System.out.println("3-10ton");
            }

            public abstract void year_Of_Issue();
        }

        public abstract class buses implements Cars {
            @Override
            public void passenger_Capacity() {
                System.out.println("7-60person");
            }

            @Override
            public void weight() {
                System.out.println("1-20ton");
            }

            public abstract void year_Of_Issue();
        }
        public class OKA extends passenger_Car {
            @Override
            public void year_Of_Issue() {
                System.out.println("2008year");
            }
        }
    public class NIVA extends passenger_Car {
        @Override
        public void year_Of_Issue() {
            System.out.println("2011year");
        }
    }
    public class Nissan extends passenger_Car {
        @Override
        public void year_Of_Issue() {
            System.out.println("2012year");
        }
    }
    public class GAZ extends trucks {
        @Override
        public void year_Of_Issue() {
            System.out.println("1986year");
        }
    }
    public class LEAZ extends trucks {
        @Override
        public void year_Of_Issue() {
            System.out.println("1998year");
        }
    }
    public class OPEL extends trucks {
        @Override
        public void year_Of_Issue() {
            System.out.println("2009year");
        }
    }
    public class YAZ extends buses {
        @Override
        public void year_Of_Issue() {
            System.out.println("1988year");
        }
    }
    public class PAZ extends buses {
        @Override
        public void year_Of_Issue() {
            System.out.println("2004year");
        }
    }
    public class LYAZ extends buses {
        @Override
        public void year_Of_Issue() {
            System.out.println("2007year");
        }
    }
        public static void main(String[] args) {

            // write your code here

        }


}
