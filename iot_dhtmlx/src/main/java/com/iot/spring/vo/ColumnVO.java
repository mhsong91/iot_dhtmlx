package com.iot.spring.vo;

public class ColumnVO {
private String column_name;
private String column_default;
private String data_type;
private String character_maximum_length;
private String column_type;
private String column_key;
private String column_comment;
public String getColumn_name() {
	return column_name;
}
public void setColumn_name(String column_name) {
	this.column_name = column_name;
}
public String getColumn_default() {
	return column_default;
}
public void setColumn_default(String column_default) {
	this.column_default = column_default;
}
public String getData_type() {
	return data_type;
}
public void setData_type(String data_type) {
	this.data_type = data_type;
}
public String getCharacter_maximum_length() {
	return character_maximum_length;
}
public void setCharacter_maximum_length(String character_maximum_length) {
	this.character_maximum_length = character_maximum_length;
}
public String getColumn_type() {
	return column_type;
}
public void setColumn_type(String column_type) {
	this.column_type = column_type;
}
public String getColumn_key() {
	return column_key;
}
public void setColumn_key(String column_key) {
	this.column_key = column_key;
}
public String getColumn_comment() {
	return column_comment;
}
public void setColumn_comment(String column_comment) {
	this.column_comment = column_comment;
}
@Override
public String toString() {
	return "ColumnVO [column_name=" + column_name + ", column_default=" + column_default + ", data_type=" + data_type
			+ ", character_maximum_length=" + character_maximum_length + ", column_type=" + column_type
			+ ", column_key=" + column_key + ", column_comment=" + column_comment + "]";
}

}
