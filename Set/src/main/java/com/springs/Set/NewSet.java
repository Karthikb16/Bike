package com.springs.Set;

import java.util.Set;

public class NewSet {
private int id;
private String name;
private Set<String> Details;
public NewSet(int id, String name, Set<String> details) {
	super();
	this.id = id;
	this.name = name;
	Details = details;
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
public Set<String> getDetails() {
	return Details;
}
public void setDetails(Set<String> details) {
	Details = details;
}
@Override
public String toString() {
	return "NewSet [id=" + id + ", name=" + name + ", Details=" + Details + "]";
}

}
