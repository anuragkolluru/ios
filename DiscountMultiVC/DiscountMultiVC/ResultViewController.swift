//
//  ResultViewController.swift
//  DiscountMultiVC
//
//  Created by Kolluru,Anurag on 3/22/22.
//

import UIKit

class ResultViewController: UIViewController {

    @IBOutlet weak var enteredAmountOutlet: UILabel!
    
    @IBOutlet weak var enteredDiscountRate: UILabel!
    
    @IBOutlet weak var PriceAfterDiscount: UILabel!
    
    var amount = ""
    var discrate = ""
    var priceAfterDisc = ""
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        enteredAmountOutlet.text = enteredAmountOutlet.text! + "  " + amount
        enteredDiscountRate.text = enteredDiscountRate.text! + "  " + discrate
        PriceAfterDiscount.text = PriceAfterDiscount.text! + "  " + priceAfterDisc

        // Do any additional setup after loading the view.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
