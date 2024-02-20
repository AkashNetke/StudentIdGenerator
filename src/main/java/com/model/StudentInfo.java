package com.model;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

	  private String fullName;
	    private byte[] photograph; // Store photograph as byte array
	    private Date dateOfBirth;
	    private Date issueDate;
	    private Date expirationDate;
	    private String institutionName;
	    private byte[] signature; // Store signature as byte array
	    private String contactInformation;
	    private String emergencyContactInformation;
		
	    
	    public StudentInfo() {
			super();
			// TODO Auto-generated constructor stub
		}


		public StudentInfo(int studentId, String fullName, byte[] photograph, Date dateOfBirth, Date issueDate,
				Date expirationDate, String institutionName, byte[] signature, String contactInformation,
				String emergencyContactInformation) {
			super();
			this.studentId = studentId;
			this.fullName = fullName;
			this.photograph = photograph;
			this.dateOfBirth = dateOfBirth;
			this.issueDate = issueDate;
			this.expirationDate = expirationDate;
			this.institutionName = institutionName;
			this.signature = signature;
			this.contactInformation = contactInformation;
			this.emergencyContactInformation = emergencyContactInformation;
		}


		public int getStudentId() {
			return studentId;
		}


		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}


		public String getFullName() {
			return fullName;
		}


		public void setFullName(String fullName) {
			this.fullName = fullName;
		}


		public byte[] getPhotograph() {
			return photograph;
		}


		public void setPhotograph(byte[] photograph) {
			this.photograph = photograph;
		}


		public Date getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


		public Date getIssueDate() {
			return issueDate;
		}


		public void setIssueDate(Date issueDate) {
			this.issueDate = issueDate;
		}


		public Date getExpirationDate() {
			return expirationDate;
		}


		public void setExpirationDate(Date expirationDate) {
			this.expirationDate = expirationDate;
		}


		public String getInstitutionName() {
			return institutionName;
		}


		public void setInstitutionName(String institutionName) {
			this.institutionName = institutionName;
		}


		public byte[] getSignature() {
			return signature;
		}


		public void setSignature(byte[] signature) {
			this.signature = signature;
		}


		public String getContactInformation() {
			return contactInformation;
		}


		public void setContactInformation(String contactInformation) {
			this.contactInformation = contactInformation;
		}


		public String getEmergencyContactInformation() {
			return emergencyContactInformation;
		}


		public void setEmergencyContactInformation(String emergencyContactInformation) {
			this.emergencyContactInformation = emergencyContactInformation;
		}


		@Override
		public String toString() {
			return "StudentInfo [studentId=" + studentId + ", fullName=" + fullName + ", photograph="
					+ Arrays.toString(photograph) + ", dateOfBirth=" + dateOfBirth + ", issueDate=" + issueDate
					+ ", expirationDate=" + expirationDate + ", institutionName=" + institutionName + ", signature="
					+ Arrays.toString(signature) + ", contactInformation=" + contactInformation
					+ ", emergencyContactInformation=" + emergencyContactInformation + "]";
		}
		
	    
	    
	    
	    
	    
}
