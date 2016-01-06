package com.coherence.extend.pojo;

import java.io.IOException;
import java.io.Serializable;

import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofWriter;
import com.tangosol.io.pof.PortableObject;

public class Person implements PortableObject, Serializable{


	/**
	 *
	 */
	private static final long serialVersionUID = 4916031105290104582L;
	/**
	 *
	 */




	private String id;
	private String firstName;
	private String lastName;


	private final int ID = 0;
	private final int FIRST_NAME = 1;
	private final int LAST_NAME = 2;

	/**
	 *
	 */
	//private static final long serialVersionUID = 1L;



	public Person(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public void readExternal(PofReader reader) throws IOException {
		// Reads Person object from the serialized form
		id = reader.readString(ID);
		firstName = reader.readString(FIRST_NAME);
		lastName = reader.readString(LAST_NAME);

	}
	@Override
	public void writeExternal(PofWriter writer) throws IOException {
		// Writes Person object into the serialized form

		writer.writeString(ID, id);
		writer.writeString(FIRST_NAME, firstName);
		writer.writeString(LAST_NAME, lastName);


	}


}
