package org.jsp.chetan.demo_hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
		int id;
	@Column
		String name;
	@Column
		double per;
		public Student() {
			
		}
		public Student(int id, String name, double per) {
			super();
			this.id = id;
			this.name = name;
			this.per = per;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPer() {
			return per;
		}
		public void setPer(double per) {
			this.per = per;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
		}
		
}
