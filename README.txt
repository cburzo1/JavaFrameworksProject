 NOTE:
        prompt E
        filename: BootStrapData.java
        line number: 49
        Change: added the sample inventory which populates if both parts and pro

NOTE:
        prompt E
        filename: MainScreenControllerr.java
        line number: 59
        Change: Removed the incorrect sample inventory instantiation which is supposed to be done
        in the BootStrap Data

NOTE:
        prompt E
        filename: mainscreen.html
        line number: 42, 94
        Change: Removed the incorrect sample inventory that does not have active buttons

------------------------------------------------------------------------------
commit a776cf3bf93fb6f788fbde3100fc0a2eb8260dab (HEAD -> working_branch, origin/working_branch)
Author: chris burzo <cburzo1@wgu.edu>
Date:   Mon Mar 25 07:53:03 2024 -0400

    Revision-2

** In mainscreen.html at lines: 50 - 52 and 101 - 103
Added Buy Now button to Sample inventory

** Removed the function call in the update field and fixed the whitelabel error

----------------------------------------------------------------------------
commit 44b5b7d8c8f97ca902106f40dde41c9f830137cf (HEAD -> working_branch, origin/working_branch)
Author: chris burzo <cburzo1@wgu.edu>
Date:   Thu Mar 21 06:48:34 2024 -0400

    FINAL

-----------------------------------------------------------------------------

commit 227cc4db4f9bf0f4e4ba08c6e2f58af19ee9561f
Author: chris burzo <cburzo1@wgu.edu>
Date:   Fri Mar 15 06:55:17 2024 -0400

    added studentREADME and Git Brach History

-----------------------------------------------------------------------------

commit 06bb573e0782ad4b58073bcd7434a3d27e48b972
Author: chris burzo <cburzo1@wgu.edu>
Date:   Fri Mar 15 06:54:05 2024 -0400

    completed: studentCreatedREADME and Git History txt[C

-----------------------------------------------------------------------------

commit c4658416c19bf421dac751c4ba9adc0a8bc97cd3
Author: chris burzo <cburzo1@wgu.edu>
Date:   Fri Mar 15 06:03:11 2024 -0400

    PROMPTS H I K J

    NOTE:
        prompt H
        filename: Part.java
        line number: 40
        Change: Fixed the iteration for the associated parts so that there is an inventory check for
    	each associated part on the product. If the inventory of products is greater than the
    	associated parts, it will throw an error on that form

    NOTE:
        prompt I
        filename: PartTest.java
        line number: 105 - 139
        Change: Added required tests for max and min

    ** Removed the delete validator as it was not in use

    NOTE:
        prompt J
        filename: Part.java
        line number: 105 - 139
        Change: Removed the annotation for delete validator

-----------------------------------------------------------------------------

commit 3675a93159512ca5e15285b00869ff1de8df9d43
Author: chris burzo <cburzo1@wgu.edu>
Date:   Mon Mar 4 09:46:09 2024 -0500

    PROMPT G

    NOTE:
        prompt G
        filename: Part.java
        line number: 32, 38, 62, 114,188,122, 126
        Change: Added minimum and maximum inventory to the domain along with the
    	setters and getters. I also added the max and min to the overloaded
    	constructor so I can use it for my sample inventory.

    NOTE:
        prompt G
        filename: Part.java
        line number: 20
        Change:

       NOTE:
        prompt G
        filename: Part.java
        line number: 20
        Change: Added a reference to parent class to instantiate the sample parts
        	This was nessesary because the Part class is a default class and cannot be instantiated
        	from the outside

    NOTE:
        prompt G
        filename: InhousePartForm.html
        line number: 24 - 37
        Change: Added minimum and maximum fields to the form

    NOTE:
        prompt G
        filename: OutsourcedPartForm.html
        line number: 25 - 37
        Change: Added minimum and maximum fields to the form

    ** Created isBetweenMaxMin and isBetweenMaxMinValidator to enforce that the user input is between
    max and min

    NOTE:
        prompt G
        filename: Part.java
        line number: 17
        Change: Added annotation to call validator if the user enters out-of-bounds for
    	max and min fields

    ** When you type an inventory that is out of the bounds of your max and min and press submit
    the errors will trigger in the binding result and be displayed accordingly in the form

-----------------------------------------------------------------------------

commit bd4a34f6e3bb3c23810b050f2c54451421e10dbb
Author: chris burzo <cburzo1@wgu.edu>
Date:   Fri Mar 1 19:56:52 2024 -0500

    ALTER TABLE DDL ERROR

-----------------------------------------------------------------------------

commit 283d8fe934b13b1315388bb4cb42f68d53217020
Author: chris burzo <cburzo1@wgu.edu>
Date:   Wed Feb 28 20:47:31 2024 -0500

    PROMPT F

    NOTE:
        prompt F
        filename: mainscreen.html
        line number: 65, 116
        Change: Added 'Buy Now' buttons

    NOTE:
        prompt F
        filename: AddProductController.java
        line number: 196
        Change: Added Decrement functionailty for the 'Buy Now' buttons

    NOTE:
        prompt F
        filename: AddPartController.java
        line number: 69
        Change: Added Decrement functionailty for the 'Buy Now' buttons

    NOTE:
        prompt F
        filename: AddProductController.java
        line number: 57
        Change: Fixed the inventory calculation in the loop to make it take inventory from the existing
        parts if there is enough inventory

    ** Created confirmationDecrementProduct.html which appears after you hit 'Buy Now'

-----------------------------------------------------------------------------

commit ac5e0d3bb50eb4897c89668bf7aba1bddc8b0ddd
Author: chris burzo <cburzo1@wgu.edu>
Date:   Wed Feb 28 18:38:14 2024 -0500

    PROMPT E

    NOTE:
        prompt E
        filename: MainscreenScreenController.java
        line number: 50 - 69
        Change: Added static sample arrays for product

    NOTE:
        prompt E
        filename: MainscreenScreenController.java
        line number: 50 - 69
        Change: Added static sample arrays for product and part

    NOTE:
        prompt E
        filename: mainscreen.html
        line number: 42, 56, 94, 107
        Change: Created an if else statement using thymeleaf which displays the
    	sample inventory if there are no products or parts in the database.
    	the sample inventory goes away when you put parts and products into the
    	database by adding them, but will reapear if you delete all products
    	in the database.

-----------------------------------------------------------------------------

commit 28fc19165d8a1ce1a4031b3ec7e5bd5165cf331f
Author: chris burzo <cburzo1@wgu.edu>
Date:   Tue Feb 27 11:01:21 2024 -0500

    PROMPT D

NOTE:
    prompt D
    filename: mainscreen.html
    line number: 122
    Change: <!--Added a static link to the about page-->

** Created About.html

NOTE:
    prompt D
    filename: MainscreenScreenController.java
    line number: 83
    Change: Added route to /About Page

-----------------------------------------------------------------------------

commit 73d8838799b981c85c33d0e8d8a7fd170c3e4508
Author: chris burzo <cburzo1@wgu.edu>
Date:   Mon Feb 26 08:52:23 2024 -0500

    PROMPT C

NOTE:
    prompt C
    filename: mainscreen.html
    line number: 14
    Change: changed "My Bicycle Shop" to "My Computer Shop"

NOTE:
    prompt C
    filename: mainscreen.html
    line number: 19
    Change: changed "Shop" to "Computer Shop"