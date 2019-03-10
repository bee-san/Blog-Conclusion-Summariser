public static void cheapest_account(StandardAccount newBronzeAcc, StandardAccount newSilverAcc, StandardAccount newGoldAcc) {

    StandardAccount cheapestObject = newBronzeAcc; // cheapest account is the cheapestObject
    StandardAccount[] prices = new StandardAccount[3];
    prices[0] = newBronzeAcc;
    prices[1] = newSilverAcc;
    prices[2] = newGoldAcc;

    double minimum = prices[0].total;

    for (int i = 0; i <= prices.length - 1; i++){
        // loop through prices array
        // using min algorithm
        if (prices[i].total < minimum){
            minimum = prices[i].total;
            cheapestObject = prices[i];
        }
        // if two objects have same price, pick one with higher preference
        else if (prices[i].total == minimum && prices[i] != cheapestObject){
            // if you want the user to have less stuff (to save the company money)
            // change the ">" to "<"
            if (prices[i].preference > cheapestObject.preference){
                minimum = prices[i].total;
                cheapestObject = prices[i];
            }
        }
    }

    System.out.println("\nThe cheapest account is " + cheapestObject.accountName + ".");

     } 
