// Converted Playwright TypeScript equivalent of Selenium methods
import { chromium, expect, Page, Browser, BrowserContext } from '@playwright/test';

(async () => {
  const browser: Browser = await chromium.launch({ headless: false });
  const context: BrowserContext = await browser.newContext();
  const page: Page = await context.newPage();

  // Maximize window (Playwright launches with full screen by default)
  await page.setViewportSize({ width: 1920, height: 1080 });

  // Open website
  await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');

  // Wait for username field
  const userName = await page.waitForSelector('#dropdown_id');

  // Send keys
  await userName.fill('Admin');
  await page.fill('[name="password"]', 'admin123');

  // Click login button
  await page.click('button');

  // Hover over menu
  await page.hover("text=My info");

  // Right click (context click)
  await page.click("text=My info", { button: 'right' });

  // Click and hold equivalent
  await page.mouse.move(200, 200); // adjust based on element
  await page.mouse.down();
  await page.mouse.up();

  // CTRL + C
  await page.keyboard.down('Control');
  await page.keyboard.press('c');
  await page.keyboard.up('Control');

  // Navigation
  await page.goBack();
  await page.reload();

  // Drag and drop
  await page.dragAndDrop('#draggable', '#droppable');

  // Dropdown handling
  await page.selectOption('#dropdown_id', [
    { label: 'Option1' },
    { index: 2 },
    { value: 'india' }
  ]);

  // Screenshot
  await page.screenshot({ path: 'screenshot.png' });

  // Scroll into view
  const footer = await page.$('footer');
  await footer?.scrollIntoViewIfNeeded();

  // Scroll by JS
  await page.evaluate(() => window.scrollBy(0, 300));

  // Alert handling
  page.on('dialog', async dialog => {
    console.log(dialog.message());
    await dialog.accept(); // or dialog.dismiss();
  });
  // Trigger an alert in the app if needed

  // Switch to frame
  const frame = page.frame({ name: 'frameName' });
  if (frame) {
    // interact with frame
  }

  // Handle multiple tabs/windows
  const [newPage] = await Promise.all([
    context.waitForEvent('page'),
    page.evaluate(() => window.open('https://example.com')),
  ]);
  await newPage.bringToFront();
  console.log(await newPage.title());
  await newPage.close();

  // Switch back to original tab
  await page.bringToFront();

  // Delete cookies
  await context.clearCookies();

  // Shadow DOM handling
  const shadowHost = await page.$('shadow-host-selector');
  const shadowRoot = await shadowHost?.evaluateHandle(el => (el as any).shadowRoot);
  const shadowElement = await shadowRoot?.asElement()?.$('button.shadow-button');
  await shadowElement?.click();

  // Close browser
  await browser.close();
})();
