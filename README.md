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



# Prerequisite to use Spring AI Reference ?
1) You are a Spring Developer and want to learn Spring AI

2) You want to incorporate AI to an existing Application

3) Basic Knowledge of prompts that are required to work with ChatGPT or any other Generative AI based similar tool

What is a Prompt in generative AI?
In generative AI, a “prompt” refers to the input provided to a language model to generate a response or output. The prompt acts as a starting point or a query that we use to generate a content. It can be a single sentence, a paragraph, or even a series of instructions that guide us in producing meaningful and contextually relevant content. Prompts guide an AI model to produce specific outputs. Writing effective prompts is essential for improving the resulting output.

You may also visit prompts for Java Developers in order to practice various useful prompts.

# What are Prompt Templates?
“Prompt templates” refer to predefined or reusable structures for prompts in generative AI. These templates provide a standardized format or set of instructions that users can follow to interact with language models effectively. These templates often include placeholders or slots where users can insert specific information relevant to their task. Spring AI employs the OSS library, StringTemplate, for this purpose.

For example, consider the simple prompt templates:

Translate the following English text into Spanish: "{text}"
In this template, {text} is a placeholder where users can replace it with the actual text they want to translate.

Tell me a {adjective} joke about {content}.
In this template, {adjective} and {content} are the placeholders where users can replace it with the actual text to get the desired result.

In Spring AI, prompt templates can be compared to the “‘View'” in Spring MVC architecture. A model object, typically a java.util.Map, is provided to populate placeholders within the template. The “‘rendered'” string becomes the content of the prompt supplied to the AI model.



# What is ChatClient in Spring AI?
The ChatClient is a functional interface simplifies the interaction with AI Models. It helps connect to different AI Models that might have different ways of working. The interface currently works with text input and output only, but we should expect more types in the future. Keep in mind that some classes and interfaces might change in later stages.