package dur.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "clients", catalog = "legacy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findById", query = "SELECT c FROM Client c WHERE c.id = :id"),
    @NamedQuery(name = "Client.findByName", query = "SELECT c FROM Client c WHERE c.name = :name"),
    @NamedQuery(name = "Client.findByAddress", query = "SELECT c FROM Client c WHERE c.address = :address"),
    @NamedQuery(name = "Client.findByCity", query = "SELECT c FROM Client c WHERE c.city = :city"),
    @NamedQuery(name = "Client.findByProvince", query = "SELECT c FROM Client c WHERE c.province = :province"),
    @NamedQuery(name = "Client.findByPostal", query = "SELECT c FROM Client c WHERE c.postal = :postal"),
    @NamedQuery(name = "Client.findByCountry", query = "SELECT c FROM Client c WHERE c.country = :country"),
    @NamedQuery(name = "Client.findByPhone1", query = "SELECT c FROM Client c WHERE c.phone1 = :phone1"),
    @NamedQuery(name = "Client.findByEmail", query = "SELECT c FROM Client c WHERE c.email = :email"),
    @NamedQuery(name = "Client.findByDateCreated", query = "SELECT c FROM Client c WHERE c.dateCreated = :dateCreated"),
    @NamedQuery(name = "Client.findByDateUpdated", query = "SELECT c FROM Client c WHERE c.dateUpdated = :dateUpdated"),
    @NamedQuery(name = "Client.findByDateCancelled", query = "SELECT c FROM Client c WHERE c.dateCancelled = :dateCancelled"),
    @NamedQuery(name = "Client.findByDateSold", query = "SELECT c FROM Client c WHERE c.dateSold = :dateSold"),
    @NamedQuery(name = "Client.findByRegFee", query = "SELECT c FROM Client c WHERE c.regFee = :regFee"),
    @NamedQuery(name = "Client.findByTaxRate", query = "SELECT c FROM Client c WHERE c.taxRate = :taxRate"),
    @NamedQuery(name = "Client.findByRefunded", query = "SELECT c FROM Client c WHERE c.refunded = :refunded"),
    @NamedQuery(name = "Client.findByOpener", query = "SELECT c FROM Client c WHERE c.opener = :opener"),
    @NamedQuery(name = "Client.findByCloser1", query = "SELECT c FROM Client c WHERE c.closer1 = :closer1"),
    @NamedQuery(name = "Client.findByYear", query = "SELECT c FROM Client c WHERE c.year = :year"),
    @NamedQuery(name = "Client.findByMake", query = "SELECT c FROM Client c WHERE c.make = :make"),
    @NamedQuery(name = "Client.findByModel", query = "SELECT c FROM Client c WHERE c.model = :model"),
    @NamedQuery(name = "Client.findByPrice", query = "SELECT c FROM Client c WHERE c.price = :price"),
    @NamedQuery(name = "Client.findByTrim", query = "SELECT c FROM Client c WHERE c.trim = :trim"),
    @NamedQuery(name = "Client.findByKilometres", query = "SELECT c FROM Client c WHERE c.kilometres = :kilometres"),
    @NamedQuery(name = "Client.findByExteriorColor", query = "SELECT c FROM Client c WHERE c.exteriorColor = :exteriorColor"),
    @NamedQuery(name = "Client.findByInteriorColor", query = "SELECT c FROM Client c WHERE c.interiorColor = :interiorColor"),
    @NamedQuery(name = "Client.findByInteriorType", query = "SELECT c FROM Client c WHERE c.interiorType = :interiorType"),
    @NamedQuery(name = "Client.findByDescription", query = "SELECT c FROM Client c WHERE c.description = :description"),
    @NamedQuery(name = "Client.findByFeatures", query = "SELECT c FROM Client c WHERE c.features = :features"),
    @NamedQuery(name = "Client.findByStatus", query = "SELECT c FROM Client c WHERE c.status = :status"),
    @NamedQuery(name = "Client.findByCompany", query = "SELECT c FROM Client c WHERE c.company = :company"),
    @NamedQuery(name = "Client.findByCloser2", query = "SELECT c FROM Client c WHERE c.closer2 = :closer2"),
    @NamedQuery(name = "Client.findByPhone2", query = "SELECT c FROM Client c WHERE c.phone2 = :phone2"),
    @NamedQuery(name = "Client.findByMileageType", query = "SELECT c FROM Client c WHERE c.mileageType = :mileageType"),
    @NamedQuery(name = "Client.findByConfirmation", query = "SELECT c FROM Client c WHERE c.confirmation = :confirmation"),
    @NamedQuery(name = "Client.findByPaymentMethod", query = "SELECT c FROM Client c WHERE c.paymentMethod = :paymentMethod"),
    @NamedQuery(name = "Client.findByRecording", query = "SELECT c FROM Client c WHERE c.recording = :recording"),
    @NamedQuery(name = "Client.findByVerifier", query = "SELECT c FROM Client c WHERE c.verifier = :verifier"),
    @NamedQuery(name = "Client.findByNotes", query = "SELECT c FROM Client c WHERE c.notes = :notes")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 33)
    @Column(name = "name", length = 33)
    private String name;
    @Size(max = 34)
    @Column(name = "address", length = 34)
    private String address;
    @Size(max = 30)
    @Column(name = "city", length = 30)
    private String city;
    @Size(max = 5)
    @Column(name = "province", length = 5)
    private String province;
    @Size(max = 6)
    @Column(name = "postal", length = 6)
    private String postal;
    @Size(max = 20)
    @Column(name = "country", length = 20)
    private String country;
    @Size(max = 15)
    @Column(name = "phone1", length = 15)
    private String phone1;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 49)
    @Column(name = "email", length = 49)
    private String email;
    @Size(max = 30)
    @Column(name = "date_created", length = 30)
    private String dateCreated;
    @Size(max = 30)
    @Column(name = "date_updated", length = 30)
    private String dateUpdated;
    @Size(max = 30)
    @Column(name = "date_cancelled", length = 30)
    private String dateCancelled;
    @Size(max = 30)
    @Column(name = "date_sold", length = 30)
    private String dateSold;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "reg_fee", nullable = false, precision = 6, scale = 2)
    private BigDecimal regFee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_rate", nullable = false)
    private int taxRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "refunded", nullable = false, precision = 6, scale = 2)
    private BigDecimal refunded;
    @Size(max = 26)
    @Column(name = "opener", length = 26)
    private String opener;
    @Size(max = 26)
    @Column(name = "closer1", length = 26)
    private String closer1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year", nullable = false)
    private int year;
    @Size(max = 25)
    @Column(name = "make", length = 25)
    private String make;
    @Size(max = 33)
    @Column(name = "model", length = 33)
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price", nullable = false, precision = 8, scale = 2)
    private BigDecimal price;
    @Size(max = 25)
    @Column(name = "trim", length = 25)
    private String trim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kilometres", nullable = false)
    private int kilometres;
    @Size(max = 23)
    @Column(name = "exterior_color", length = 23)
    private String exteriorColor;
    @Size(max = 24)
    @Column(name = "interior_color", length = 24)
    private String interiorColor;
    @Size(max = 20)
    @Column(name = "interior_type", length = 20)
    private String interiorType;
    @Size(max = 1968)
    @Column(name = "description", length = 1968)
    private String description;
    @Size(max = 1828)
    @Column(name = "features", length = 1828)
    private String features;
    @Size(max = 20)
    @Column(name = "status", length = 20)
    private String status;
    @Size(max = 45)
    @Column(name = "company", length = 45)
    private String company;
    @Size(max = 45)
    @Column(name = "closer2", length = 45)
    private String closer2;
    @Size(max = 15)
    @Column(name = "phone2", length = 15)
    private String phone2;
    @Size(max = 45)
    @Column(name = "mileageType", length = 45)
    private String mileageType;
    @Size(max = 45)
    @Column(name = "confirmation", length = 45)
    private String confirmation;
    @Size(max = 45)
    @Column(name = "payment_method", length = 45)
    private String paymentMethod;
    @Size(max = 45)
    @Column(name = "recording", length = 45)
    private String recording;
    @Size(max = 45)
    @Column(name = "verifier", length = 45)
    private String verifier;
    @Size(max = 20000)
    @Column(name = "notes", length = 20000)
    private String notes;

    public Client() {
    }

    public Client(Integer id) {
        this.id = id;
    }

    public Client(Integer id, BigDecimal regFee, int taxRate, BigDecimal refunded, int year, BigDecimal price, int kilometres) {
        this.id = id;
        this.regFee = regFee;
        this.taxRate = taxRate;
        this.refunded = refunded;
        this.year = year;
        this.price = price;
        this.kilometres = kilometres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDateCancelled() {
        return dateCancelled;
    }

    public void setDateCancelled(String dateCancelled) {
        this.dateCancelled = dateCancelled;
    }

    public String getDateSold() {
        return dateSold;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getRefunded() {
        return refunded;
    }

    public void setRefunded(BigDecimal refunded) {
        this.refunded = refunded;
    }

    public String getOpener() {
        return opener;
    }

    public void setOpener(String opener) {
        this.opener = opener;
    }

    public String getCloser1() {
        return closer1;
    }

    public void setCloser1(String closer1) {
        this.closer1 = closer1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public int getKilometres() {
        return kilometres;
    }

    public void setKilometres(int kilometres) {
        this.kilometres = kilometres;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCloser2() {
        return closer2;
    }

    public void setCloser2(String closer2) {
        this.closer2 = closer2;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getMileageType() {
        return mileageType;
    }

    public void setMileageType(String mileageType) {
        this.mileageType = mileageType;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "dur.jpa.Client[ id=" + id + " ]";
        String s = "\nname\t" + name
                + "\nmake\t" + make
                + "\nprice\t" + price
                + "\nphone\t" + phone1;
        return s;

    }

}
