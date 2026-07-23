
// public class java_14_jan_2025 {

//     interface camera {

//         void takesnap();

//         void recordvideo();

//     }

//     interface wifi {
//         String[] getNetwork();

//         void commonToconnect();
//     }

//     class MycellPhone {
//         void callnumber(int phoneNumber) {

//             System.out.println("calling" + phoneNumber);

//         }

//         void pickCall() {
//             System.out.println("connecting...");
//         }

//     }

//     class mysmartPhone extends MycellPhone implements mywifi, mycamera {

//         public void takesnap() {
//             System.out.println("taking snap");
//         }

//         public void recordvideo() {
//             System.out.println("record video");
//         }

//     public String[] getNetwork(){
//         System.out.println("getting list of network");
//         String[] networklist = {"omkar","prashant","anjali"}
//         return networklist ;
//     }

//         public void connectToNetwork(String network) {
//             system.out.println("connecting to " + network);
//         }

//     }

//     public static void main(String[] args) {
// mysmartphone ms = new mysmartPhone() ;
// String[] ms.getNetwork();


//     }

// }
