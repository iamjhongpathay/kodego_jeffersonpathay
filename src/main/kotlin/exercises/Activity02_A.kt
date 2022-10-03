fun main(){
    /*
    implement Activity 01 -  A using data structure.
    */


    //data structure of Student Directory
    var studentsFName = mutableMapOf<Int, String>(101 to "John", 102 to "Paul", 103 to "Sarah")
    var studentsSurname = mutableMapOf<Int, String>(101 to "Lennon", 102 to "McArty", 103 to "G")
    var studentsSection = mutableMapOf<Int, String>(101 to "MDP1", 102 to "WDP1", 103 to "MDP1")
    var studentsAge = mutableMapOf<Int, Int>(101 to 18, 102 to 17, 103 to 20)
    var studentsGender = mutableMapOf<Int, String>(101 to "Male", 102 to "Male", 103 to "Female")
    var studentsAddress = mutableMapOf<Int, String>(101 to "Las Piñas City", 102 to "Cavite City", 103 to "Pasay City")
    var studentsPhone = mutableMapOf<Int, String>(101 to "0999", 102 to "0998", 103 to "0997")
    var studentsGrade = mutableMapOf<Int, Double>(101 to 2.5, 102 to 2.0, 103 to 1.75)

    //variables for search
    var studentID : Int = 0
    var studentSurname: String = ""

    //variable for adding data
    var iD : Int = 0
    var firstName : String = ""
    var surname : String = ""
    var age : Int = 0
    var gender : String = ""
    var address : String = ""
    var phoneNum : String = ""
    var section : String = ""
    var grade : Double = 0.0

    /* MAIN USER INTERFACE */
    var condition : Boolean = true
    while (condition){
        println("[-----------Student Directory-----------]")
        println()
        println("[1] Students List")
        println("[2] Search")
        println("[3] Add")
        println("[4] Edit")
        println("[5] Delete")
        println("[6] EXIT")
        print("Enter a Number to proceed: ")
        var userOption : Int = readln().toInt()
        if(userOption == 1){                                                /* User Option [1] Student List */
            println("[-------------List of Students-------------]")
            println("Student IDs:           Names:    ")

            //traversing the selected data from data structure
            for(key in studentsSurname.keys){
                println("$key                    ${studentsFName[key]} ${studentsSurname[key]}")
            }
            println()

        }else if(userOption == 2){                                          /* User Option [2] Search */
            println("[-----------Search for a Students Data-----------]")

            print("Enter Students ID: ")
            studentID = readln().toInt()
            print("Enter Surname: ")
            studentSurname = readln()
            if (studentSurname == studentsSurname[studentID]){
                println("[-------------Available Data-------------]")

                //by using the studentID it display all the data with the same studentID or Key
                println("Name: ${studentsFName[studentID]} ${studentsSurname[studentID]}             Student ID: $studentID")
                println("Section: ${studentsSection[studentID]}")
                println("Age: ${studentsAge[studentID]}")
                println("Gender: ${studentsGender[studentID]}")
                println("Address: ${studentsAddress[studentID]}")
                println("Phone Number: ${studentsPhone[studentID]}")
                println("Grade: ${studentsGrade[studentID]}")
                println()
            }else{
                println("*No Students Information Found!")
            }
        }else if(userOption == 3){                                          /* User Option [3] Add */
            //Loop for Add students
            var condition : Boolean = true
            while (condition){
                println("[-------------Add Students-------------]")

                println("Assigned a Student ID No.:")
                iD = readln().toInt()

                print("Enter First Name: ")
                firstName = readln()
                print("Enter Surname: ")
                surname = readln()

                //Add data
                studentsFName.put(iD, firstName) //(key,value)
                studentsSurname.put(iD, surname)
                print("Age: ")
                age = readln().toInt()
                studentsAge.put(iD, age)
                print("Gender:")
                gender = readln()
                studentsGender.put(iD, gender)
                print("Phone Number: ")
                phoneNum = readln()
                studentsPhone.put(iD, phoneNum)
                print("Address: ")
                address = readln()
                studentsAddress.put(iD, address)
                print("Section: ")
                section = readln()
                studentsSection.put(iD, section)
                print("Grade: ")
                grade = readln().toDouble()
                studentsGrade.put(iD, grade)
                println("*Student Name: $firstName $surname with ID:$iD is added successfully.")
                println()

                println("Do you want to add Another Student?[Yes/No]")
                var userQuestion : String = readln().lowercase()
                if(userQuestion == "no"){
                    condition = false
                }else if(userQuestion == "yes"){
                    condition = true
                }
            }

        }else if(userOption == 4){                                          /* User Option [4] Edit */
            println("[-------------Edit Students Data-------------]")

            print("Enter Student ID: ")
            studentID = readln().toInt()
            print("Enter Surname: ")
            studentSurname = readln()
            if(studentSurname == studentsSurname[studentID]){
                println("[-------------Available Data-------------]")
                println("Name: ${studentsFName[studentID]} ${studentsSurname[studentID]}             Student ID: $studentID")
                println("Section: ${studentsSection[studentID]}")
                println("Age: ${studentsAge[studentID]}")
                println("Gender: ${studentsGender[studentID]}")
                println("Address: ${studentsAddress[studentID]}")
                println("Phone Number: ${studentsPhone[studentID]}")
                println("Grade: ${studentsGrade[studentID]}")

                println(">Do you want to Edit the Data of this Student?[Yes/No]")
                var userEdit : String = readln().lowercase()

                if (userEdit == "yes"){
                    println("*Note: The Student ID Number can't be modify.")
                    println("[-------------Edit Data-------------]")

                    print("First Name: ")
                    firstName = readln()
                    studentsFName.replace(studentID, firstName)
                    print("Surname: ")
                    surname = readln()
                    studentsSurname.replace(studentID, surname)
                    print("Section: ")
                    section = readln()
                    studentsSection.replace(studentID, section)
                    print("Age: ")
                    age = readln().toInt()
                    studentsAge.replace(studentID, age)
                    print("Gender: ")
                    gender = readln()
                    studentsGender.replace(studentID, gender)
                    print("Address: ")
                    address = readln()
                    studentsAddress.replace(studentID, address)
                    print("Phone: ")
                    phoneNum = readln()
                    studentsPhone.replace(studentID, phoneNum)
                    println("*Student Name: $firstName $surname with ID:$studentID is edited successfully.")
                    println()
                }
            }else{
                println("*No Student Found!")
            }
        }else if(userOption == 5){                                          /* User Option [5] Delete */
            println("[-------------Delete Student-------------]")

            print("Enter Student ID: ")
            studentID = readln().toInt()
            print("Enter Surname: ")
            studentSurname = readln()
            if(studentSurname == studentsSurname[studentID]){
                println("[-------------Available Data-------------]")
                println("Name: ${studentsFName[studentID]} ${studentsSurname[studentID]}             Student ID: $studentID")
                println("Section: ${studentsSection[studentID]}")
                println("Age: ${studentsAge[studentID]}")
                println("Gender: ${studentsGender[studentID]}")
                println("Address: ${studentsAddress[studentID]}")
                println("Phone Number: ${studentsPhone[studentID]}")
                println("Grade: ${studentsGrade[studentID]}")

                println(">Do you want to DELETE the Data of this Student?[Yes/No]")
                var userDelete : String = readln().lowercase()

                if (userDelete == "yes"){
                    println("Deleting...")
                    studentsFName.remove(studentID, firstName)
                    studentsSurname.remove(studentID, surname)
                    studentsSection.remove(studentID, section)
                    studentsAge.remove(studentID, age)
                    studentsGender.remove(studentID, gender)
                    studentsAddress.remove(studentID, address)
                    studentsPhone.remove(studentID, phoneNum)
                    studentsGrade.remove(studentID, grade)
                    println("*Student with ID:$studentID is deleted successfully.")
                }
            }else{
                println("*No Student Found!")
            }
        }else if(userOption == 6){                                          /* User Option [6] EXIT */
            condition = false
        }
    }
    
}