package week8.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Entity
public class Destination {
	@Id
	@GeneratedValue
		private long id;
		private String country;
		private  String desinationName;
		private int ratingOutOf5;

		public Destination() {
			super();
			this.country = "US";
		}

		public Destination(String desinationName) {
			super();
			this.desinationName = desinationName;
		}

		public Destination(String country, String desinationName, int ratingOutOf5) {
			super();
			this.country = country;
			this.desinationName = desinationName;
			this.ratingOutOf5 = ratingOutOf5;
		}

		public Destination(long id, String country, String desinationName, int ratingOutOf5) {
			super();
			this.id = id;
			this.country = country;
			this.desinationName = desinationName;
			this.ratingOutOf5 = ratingOutOf5;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getDesinationName() {
			return desinationName;
		}

		public void setDesinationName(String desinationName) {
			this.desinationName = desinationName;
		}

		public int getRatingOutOf5() {
			return ratingOutOf5;
		}

		public void setRatingOutOf5(int ratingOutOf5) {
			this.ratingOutOf5 = ratingOutOf5;
		}

		@Override
		public String toString() {
			return "Destination [id=" + id + ", country=" + country + ", desinationName=" + desinationName + ", ratingOutOf5="
					+ ratingOutOf5 + "]";
		}

		

	
}
