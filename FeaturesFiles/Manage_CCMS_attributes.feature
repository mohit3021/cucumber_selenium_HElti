Feature: Manage CCMS attributes

Background: 
When i clicked on Manage CCMS attributes from left panel

@addnewattribute @smoke
Scenario: Add new attribute name
When i entered attribute name
And i clicked on Add botton
Then attribute should be added successfully

@deleteattribute @smoke
Scenario: Delete an attribute
When i clicked on Trash
Then i clicked on delete
Then verify successfull deletion

@editattribute
Scenario: edit an existing attribute
When i clicked on Edit
Then i changed attribute value
Then i clicked on update