//
//  ViewController.swift
//  DiscountMultiVC
//
//  Created by Kolluru,Anurag on 3/22/22.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var amountOutlet: UITextField!
    
    @IBOutlet weak var discountRateOutet: UITextField!
    
    var priceAfterDiscount = 0.0
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func calDiscountButtonClicked(_ sender: Any) {
        
        var amount = Double (amountOutlet.text!)
        var discrate = Double (discountRateOutet.text!)
        
        priceAfterDiscount = amount! - (amount!*discrate!/100)
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        var transition = segue.identifier
        if transition == "ResultSegve"{
            var destination = segue.destination as!
            ResultViewController
            
            destination.amount = amountOutlet.text!
            destination.discrate = discountRateOutet.text!
            destination.priceAfterDisc = String (priceAfterDiscount)
        }
    }
    
}

