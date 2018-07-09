Feature: Free CRM ContactsPage Test

Scenario Outline: Create New Contacts under Contacts Page

 Given Login to Free CRM
 When Providing valid "<username>" and "<password>"
 Then Go to contacts page , create new contact by entering "<firstname>" , "<lastname>", and "<position>"
 
Examples:
        |username|password|firstname|lastname|position|
		|naveendommata|Welcome@123|naveen|reddy|SDET|
