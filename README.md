# springai
 Spring AI to integrate with ChatGPT

How to get OpenAI secret key?
1) Visit openai.com and create an account if not done before. Even if you have ChatGPT account, the same credentials may work for you to login.

2) Click on OpenAI icon and go to API keys. You will find ‘Create new secret key’ link that will open a form to create a secret key. When you click on
‘Create a secret key’, the secret key will be generated which can easily be copied to the clipboard. Click on ‘Done’ to close the form.

You will need this secret key to provide the value of ‘spring.ai.openai.api-key’ in your application.properties file.



# Spring AI Reference:
In the wave of generative Artificial intelligence, everyone wants to utilize the capability of AI tools to some extent. From this prospect, the Spring community stepped forward and offered a module called ‘Spring AI’ in order to interact with AI tools and get the desired outcomes. Spring AI intended to simplify the development of applications that integrate artificial intelligence functionality without unneeded complications.

Spring AI offers abstractions that serve as the foundation for developing AI applications. These abstractions have multiple implementations, enabling easy component swapping with minimal code changes. For example, Spring AI introduces the ChatClient interface with implementations for OpenAI and Azure OpenAI. In this Spring AI reference guide, we will talk about how to add AI in our Spring based application and related concepts.



# What is ChatClient in Spring AI?
The ChatClient is a functional interface simplifies the interaction with AI Models. It helps connect to different AI Models that might have different ways of working. The interface currently works with text input and output only, but we should expect more types in the future. Keep in mind that some classes and interfaces might change in later stages.