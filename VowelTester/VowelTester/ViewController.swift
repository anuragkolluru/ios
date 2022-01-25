//
//  ViewController.swift
//  VowelTester
//
//  Created by Kolluru,Anurag on 1/25/22.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var textOutlet: UITextField!
    @IBOutlet weak var displayLable: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    @IBAction func buttonClicked(_ sender: UIButton) {
        //read the text
        var enteredText = textOutlet.text!
        //check the text has vowel or not
        if(enteredText.contains("a") || enteredText.contains("e") || enteredText.contains("i") || enteredText.contains("o") || enteredText.contains("u")){
            displayLable.text = "The text has vowel"
        }
        else{
            displayLable.text = "No vowels found!"
        }
    }
}

