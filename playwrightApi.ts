import { test, expect, request } from '@playwright/test';

test(
  'Verify POST request',
  async ({}) => {
    const context = await request.newContext({
      extraHTTPHeaders: {
        'Authorization': 'Bearer <your_token_here>',
        'Content-Type': 'application/json',
      },
    });

    const response = await context.post('<your_endpoint>/create', {
      data: {
        name: 'Nikhil',
        email: 'test@gmail.com',
      },
    });

    expect(response.ok()).toBeTruthy();
  }

);


test('POST API - Create a user', async () => {
  // Create a request context
  const requestContext = await request.newContext({
    baseURL: 'https://reqres.in'
  });

  // Define request payload
  const payload = {
    name: 'morpheus',
    job: 'leader'
  };

  // Send POST request
  const response = await requestContext.post('/api/users', {
    data: payload
  });

  // Expect response status
  expect(response.status()).toBe(201);

  // Parse and assert response body
  const responseBody = await response.json();
  expect(responseBody).toHaveProperty('name', 'morpheus');
  expect(responseBody).toHaveProperty('job', 'leader');
  expect(responseBody).toHaveProperty('id'); // dynamic id
  expect(responseBody).toHaveProperty('createdAt');

  console.log('✅ User created:', responseBody);
});