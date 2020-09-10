package sortinghat_ben;


class SortingHat {
    // Instantiate Classes
    
    Message myMessage = new Message();
    BussinessLogic myBusLog = new BussinessLogic();
    
    String userName = " ";
    String houseName = " ";
    String image = "";
    void StartNewHat() {
        
        int houseNum = 0;
        
        //2. Get start screen
        myMessage.GetStartScreen();
        
        //3. Get user name
        userName = myBusLog.GetUserName();

        //4. Get random number
        houseNum = myBusLog.GetRNDNum();

        //5. Get house
        houseName = myBusLog.GetHouse(houseNum, houseName);

        //6. Display house
        myMessage.DisplayHouse(houseName, houseNum, userName);

        //7. End
        
    }
  
    
    
    
}
