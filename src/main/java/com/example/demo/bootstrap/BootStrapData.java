package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*add an if condition to check if products and parts are in the database
        *  if not, then set the appropriate sample inventory here below.*/

        //CHANGE: Added the correct Sample Inventory handling

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        List<Product> products=(List<Product>) productRepository.findAll();
        List<InhousePart> inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();


        InhousePart[] samplePartInventory = new InhousePart[5];

        samplePartInventory[0] = new InhousePart("GPU", 400.0, 500, 500, 0);
        samplePartInventory[1] = new InhousePart("RAM", 130, 200, 500, 0);
        samplePartInventory[2] = new InhousePart("Power Supply", 250, 390, 500, 0);
        samplePartInventory[3] = new InhousePart("SSD", 250, 50, 500, 0);
        samplePartInventory[4] = new InhousePart("Computer Case", 150.0, 23, 500, 0);

        Product [] sampleProductInventory = new Product[5];

        sampleProductInventory[0] = new Product("Dell Gaming PC", 2000.0, 500);
        sampleProductInventory[1] = new Product("Lenovo Efficient Battery PC", 450, 1300);
        sampleProductInventory[2] = new Product("AlienWare Gaming PC", 2500.0, 323);
        sampleProductInventory[3] = new Product("Old Desktop from the 90s", 1.0, 2);
        sampleProductInventory[4] = new Product("Asus Work Laptop", 300.0, 5);

        if(outsourcedParts.isEmpty() && inhouseParts.isEmpty() && products.isEmpty()){
            for(int i = 0; i < 5; i++) {
                OutsourcedPart o = new OutsourcedPart();
                o.setInv(samplePartInventory[i].getInv());
                o.setCompanyName("Doma PC Company");
                o.setName(samplePartInventory[i].getName());
                o.setPrice(samplePartInventory[i].getPrice());
                o.setMaxInv(samplePartInventory[i].getMaxInv());
                o.setMinInv(samplePartInventory[i].getMinInv());
                o.setId(1L + i);
                outsourcedPartRepository.save(o);

                Product p = new Product();
                p.setInv(sampleProductInventory[i].getInv());
                p.setPrice(sampleProductInventory[i].getPrice());
                p.setName(sampleProductInventory[i].getName());
                p.setId(1L + i);
                productRepository.save(p);
            }
        }

        System.out.println("RUNNING 1234$$");

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        /*List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }*/

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        /*System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());*/

    }
}
