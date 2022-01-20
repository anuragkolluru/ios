//
//  ViewController.swift
//  hello
//
//  Created by Kolluru,Anurag on 1/20/22.
//

import UIKit

class ViewController: UIViewController {
    
    
    @IBOutlet weak var nameOutlet: UITextField!
    
    
    @IBOutlet weak var displayLable: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    @IBAction func ButtonClicked(_ sender: Any) {
        var name = nameOutlet.text!
        displayLable.text = "Hello, \(name)!"
    }
    
}
