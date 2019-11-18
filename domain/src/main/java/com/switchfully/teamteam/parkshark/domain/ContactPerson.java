package com.switchfully.teamteam.parkshark.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "CONTACT_PERSON")
public class ContactPerson {
    @Id
    private int id;

    @Column(name = "NAME")
    private String name;

    private List<PhoneNumber> phoneNumbers;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ADDRESS_ID")
    private Address address;

    private ContactPerson(Builder builder) {
        name = builder.name;
        phoneNumbers = builder.phoneNumbers;
        email = builder.email;
        address = builder.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public static final class Builder {
        private String name;
        private List<PhoneNumber> phoneNumbers;
        private String email;
        private Address address;

        public static Builder contactPerson() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPhoneNumber(List<PhoneNumber> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public ContactPerson build() {
            return new ContactPerson(this);
        }
    }
}
