package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *
 *
 *
 *
 */

@Controller
public class MainScreenControllerr {
   // private final PartRepository partRepository;
   // private final ProductRepository productRepository;'

    private PartService partService;
    private ProductService productService;

    private List<Part> theParts;
    private List<Product> theProducts;

 /*   public MainScreenControllerr(PartRepository partRepository, ProductRepository productRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
    }*/

    public MainScreenControllerr(PartService partService,ProductService productService){
        this.partService=partService;
        this.productService=productService;
    }
    @GetMapping("/mainscreen")
    public String listPartsandProducts(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
        //add to the sprig model
        //System.out.println("PART KEYWORD:: "+ productkeyword);

        //CHANGE: Removed the incorrect sample inventory instantiation which is supposed to be done in the BootStrap Data
        /*Product [] sampleProductInventory = new Product[5];

        sampleProductInventory[0] = new Product("Dell Gaming PC", 2000.0, 500);
        sampleProductInventory[1] = new Product("Lenovo Efficient Battery PC", 450, 1300);
        sampleProductInventory[2] = new Product("AlienWare Gaming PC", 2500.0, 323);
        sampleProductInventory[3] = new Product("Old Desktop from the 90s", 1.0, 2);
        sampleProductInventory[4] = new Product("Asus Work Laptop", 300.0, 5);*/

        /*InhousePart[] samplePartInventory = new InhousePart[5];

        samplePartInventory[0] = new InhousePart("GPU", 400.0, 500, 500, 0);
        samplePartInventory[1] = new InhousePart("RAM", 130, 200, 500, 0);
        samplePartInventory[2] = new InhousePart("Power Supply", 250, 390, 500, 0);
        samplePartInventory[3] = new InhousePart("SSD", 250, 50, 500, 0);
        samplePartInventory[4] = new InhousePart("Computer Case", 150.0, 23, 500, 0);*/


        //theModel.addAttribute("sampleProducts", sampleProductInventory);
        //theModel.addAttribute("sampleParts", samplePartInventory);

        List<Part> partList=partService.listAll(partkeyword);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);
    //    theModel.addAttribute("products",productService.findAll());
        List<Product> productList=productService.listAll(productkeyword);
        //System.out.println("PRODUCT LIST:: "+ productList);
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword",productkeyword);
        return "mainscreen";
    }

    //CHANGE: opened endpoint for About page
    @GetMapping("/About")
    public String ShowAbout(){

        return "About";
    }
}
