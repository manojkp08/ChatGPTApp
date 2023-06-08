# ChatGPTApp

ChatGPTApp is an application that utilizes OpenAI's GPT-3.5 model to provide conversational chatbot capabilities. The app is built using Kotlin programming language and incorporates various libraries for seamless integration with the OpenAI API.

## Features

- Conversational chatbot powered by OpenAI's GPT-3.5 model.
- User-friendly interface created using XML.
- HTTP requests to the OpenAI API using Retrofit and OkHttp.
- JSON parsing with Moshi and Gson converters for Retrofit.

## Getting Started

To get started with ChatGPTApp, follow the steps below:

1. Clone the repository:
   ```shell
   git clone https://github.com/manojkp08/ChatGPTApp.git
   ```  
2. Open the project in your preferred IDE (e.g., Android Studio).
3. Obtain an "API key" from OpenAI by following their documentation.
4. Update the "MY_API_KEY" constant in the code with your API key inside API_KEY.kt file as it is mentioned below.
   ```shell
   object API_KEY {
    const val MY_API_KEY = "YOUR API KEY"
   }
   ```
5. Build and run the application on an Android device or emulator.
## Screenshots

<img width="215" alt="image" src="https://github.com/manojkp08/ChatGPTApp/assets/122171992/c126eff8-afdf-4f7b-9d11-029783ff6f0c">
<img width="216" alt="image" src="https://github.com/manojkp08/ChatGPTApp/assets/122171992/b5bb7e53-6896-4a4c-88e4-d0022af41185">

## Dependencies

The following dependencies are used in this project:

- Retrofit: A type-safe HTTP client for making API requests.
- OkHttp: An HTTP client for efficient networking operations.
- Moshi: A modern JSON library for parsing JSON responses.
- Retrofit Gson Converter: A converter for Retrofit that uses Gson for JSON serialization and deserialization.

These dependencies are managed using the build.gradle file of the project.

## Usage

Once the ChatGPTApp is running, you can interact with the chatbot through the user interface. 
Simply type your message in the input field, and the chatbot will respond with a generated message.

## Limitations

Please note that the app's functionality is dependent on the capabilities and limitations of the OpenAI GPT-3.5 model. 
The model may not always provide accurate or contextually appropriate responses.

## Contributing

Contributions to the ChatGPTApp project are welcome. If you encounter any issues or have suggestions for improvements, 
feel free to open an issue or submit a pull request.

## Note

Ensure that you adhere to the terms and conditions of OpenAI's API usage, 
and handle any API keys securely to protect your data and prevent unauthorized access.



