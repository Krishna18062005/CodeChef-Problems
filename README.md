---

# Automated Screenshot Generator Using Selenium

This project automates the process of taking screenshots of a website at regular intervals using Selenium WebDriver in Python. The screenshots are captured with a timestamp and can be saved locally for monitoring purposes, such as checking for website changes, outages, or generating reports.

## Features

- **Automated Screenshot Capture**: Automatically takes screenshots of a given website.
- **Timestamped Filenames**: Each screenshot is saved with a timestamp to ensure uniqueness and easy identification.
- **Custom Interval**: Configurable time interval between screenshot captures.
- **Cross-Browser Support**: Works with multiple browsers such as Chrome (default) using Selenium WebDriver.

## Prerequisites

Before running the project, ensure you have the following installed:

- **Python 3.x**: The project is written in Python.
- **Selenium**: The Python Selenium package for automating browser actions.
- **WebDriver**: A browser driver like `ChromeDriver` for Selenium to interact with your browser.
- **WebDriver Manager**: Automatically installs the correct version of the driver.

You can install the necessary libraries with pip:

```bash
pip install selenium webdriver-manager
```

## Setup

1. **Clone the Repository**:
   
   ```bash
   git clone https://github.com/Krishna18062005/Automated-Screenshot-Generator-Using-Selenium.git
   cd Automated-Screenshot-Generator-Using-Selenium
   ```

2. **Install Dependencies**:
   
   If you haven't already installed the dependencies, run:

   ```bash
   pip install -r requirements.txt
   ```

3. **Configure the URL**:
   In the Python script, you can configure the URL of the website you want to take screenshots of by changing the `url` variable.

## Usage

To use the screenshot generator:

1. Open the script file `automated_screenshot.py`.
2. Modify the URL to the website you want to capture.
3. Set the interval time (in seconds) for taking screenshots.
4. Run the script:

```bash
python automated_screenshot.py
```

The script will take screenshots of the website and save them in the current directory with filenames that include the timestamp.

Example output filename:

```
screenshot_2024-12-17_14-30-00.png
```

## Customizing

- **URL**: Change the URL in the script to any webpage you want to capture.
- **Interval**: You can adjust the `time.sleep()` value in the script to change the time between each screenshot.
- **Browser**: You can modify the script to use a different browser, like Firefox, by changing the WebDriver initialization.

## Example Code

Here’s the core script to take automated screenshots:

```python
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
import time
from datetime import datetime

# Set up the WebDriver
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))

# URL to capture screenshots
url = "https://www.example.com"

# Open the webpage
driver.get(url)

# Capture screenshots at regular intervals
for i in range(5):
    # Capture screenshot
    timestamp = datetime.now().strftime("%Y-%m-%d_%H-%M-%S")
    driver.save_screenshot(f"screenshot_{timestamp}.png")
    print(f"Screenshot {i+1} saved!")
    time.sleep(10)  # Wait for 10 seconds before taking the next screenshot

# Close the driver
driver.quit()
```

### Example Output:

```
Screenshot 1 saved!
Screenshot 2 saved!
Screenshot 3 saved!
Screenshot 4 saved!
Screenshot 5 saved!
```

## Contributing

1. Fork the repository.
2. Clone your fork.
3. Create a new branch (`git checkout -b feature-name`).
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-name`).
6. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
