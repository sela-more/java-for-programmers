package Serialization;
class Person implements java.io.Serializable
{
	private String m_sName;
	Person(String sName) {m_sName = sName;}
	//Person() {m_sName = "StamName";}
	public String toString() {return m_sName;}
};