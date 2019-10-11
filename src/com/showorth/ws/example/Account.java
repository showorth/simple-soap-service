package com.showorth.ws.example;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
	public int currentBalance;
	public boolean limitReached;
	public String status;
}
