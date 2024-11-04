package model;

import java.util.ArrayList;
import java.util.List;

public class Client extends person{


//    public Client(Client client20) {
//        this.setName(client20.getName());
//        this.setEmail(client20.getEmail());
//        this.setId(client20.getId());
//        this.setPhone(client20.getPhone());
//        this.setPassword(client20.getPassword());
//        AdoptedPets=client20.AdoptedPets;
//        DonatedMoney=client20.DonatedMoney;
//        OtherDonated=client20.OtherDonated;
//    }

    public  List<Adoption>AdoptedPets=new ArrayList<>();

    public  List<MoneyDonation>DonatedMoney=new ArrayList<>();
    public  List<OtherDonation>OtherDonated=new ArrayList<>();

    public void check()
    {
        for(int i=0;i<OtherDonated.size();i++) {
            OtherDonation otherDonation = new OtherDonation();
            otherDonation = OtherDonated.get(i);
            System.out.println(otherDonation.getClientName()+" c");
            System.out.println(otherDonation.getClientId()+" c");
            System.out.println(otherDonation.getType()+" c");
            System.out.println(otherDonation.getAppointment()+" c");
        }

    }
}
