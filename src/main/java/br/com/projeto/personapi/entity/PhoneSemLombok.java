package br.com.projeto.personapi.entity;

import br.com.projeto.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
public class PhoneSemLombok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false, unique = true)
    private String number;

    public PhoneSemLombok(Long id, PhoneType type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public PhoneSemLombok() {
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public PhoneType getType() {
        return this.type;
    }

    public String getNumber() {
        return this.number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof PhoneSemLombok)) return false;
        final PhoneSemLombok other = (PhoneSemLombok) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$number = this.getNumber();
        final java.lang.Object other$number = other.getNumber();
        if (this$number == null ? other$number != null : !this$number.equals(other$number)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof PhoneSemLombok;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $number = this.getNumber();
        result = result * PRIME + ($number == null ? 43 : $number.hashCode());
        return result;
    }

    public java.lang.String toString() {
        return "Phone(id=" + this.getId() + ", type=" + this.getType() + ", number=" + this.getNumber() + ")";
    }

    public static class PhoneBuilder {
        private Long id;
        private PhoneType type;
        private String number;

        PhoneBuilder() {
        }

        public PhoneBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PhoneBuilder type(PhoneType type) {
            this.type = type;
            return this;
        }

        public PhoneBuilder number(String number) {
            this.number = number;
            return this;
        }

        public PhoneSemLombok build() {
            return new PhoneSemLombok(id, type, number);
        }

        public java.lang.String toString() {
            return "Phone.PhoneBuilder(id=" + this.id + ", type=" + this.type + ", number=" + this.number + ")";
        }
    }
}
