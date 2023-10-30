import requests
from bs4 import BeautifulSoup

def scrape_website(url):
    response = requests.get(url)
    if response.status_code == 200:
        soup = BeautifulSoup(response.content, 'html.parser')
        # Example: Scraping titles of articles from a website
        article_titles = soup.find_all('h2', class_='article-title')
        for title in article_titles:
            print(title.text.strip())
    else:
        print("Failed to retrieve the page.")

website_url = "https://example-website.com"
scrape_website(website_url)
