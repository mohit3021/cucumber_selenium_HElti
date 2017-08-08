Feature: configure fine grained rule


@newrule @smoke @regression
Scenario: Add a Fine Grainted Rule.
When I clicked on Add New Rule
Then i enter application_id
And i enter value of country.
And i select value for resource from dropdown
And i select value for resource type from dropdown
And i select dropdown value for service type from dropdown.
And I clicked of submit button

@editrule @smoke @regression
Scenario: Edit existing rule
When I clicked on edit button
When i can change value of application id
And i can change value os country
And i can select resource value again
And i can change service type from dropdown
Then i clicked on Update button

@deleterule @smoke
Scenario: Delete existing rule
When i clicked on trash button
Then select cancel option to cancel delete



