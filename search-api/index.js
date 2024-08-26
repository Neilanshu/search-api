const express = require('express');
const { body, validationResult } = require('express-validator'); // Import express-validator

const app = express();

app.use(express.json());

let suppliers = []; // In-memory storage for demonstration

app.post('/api/supplier', [
    body('companyName').notEmpty().withMessage('Company name is required'),
    body('location').notEmpty().withMessage('Location is required'),
    body('natureOfBusiness').notEmpty().withMessage('Nature of business is required'),
    body('manufacturingProcesses').notEmpty().withMessage('Manufacturing process is required'),
    body('website').isURL().withMessage('Website must be a valid URL'),
  ], (req, res) => {
    const errors = validationResult(req);
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() });
    }
    
    const newSupplier = req.body;
    suppliers.push(newSupplier); // Add supplier to in-memory storage
    res.send('Supplier created successfully!');
  });
app.get('/api/suppliers', (req, res) => {
    const { page = 1, limit = 10 } = req.query; // Get page and limit from query params, default to page 1 and limit 10
    const startIndex = (page - 1) * limit;
    const endIndex = page * limit;
  
    const paginatedSuppliers = suppliers.slice(startIndex, endIndex); // Get a slice of the suppliers array
    res.json(paginatedSuppliers); // Send the paginated list of suppliers
  });

const port = 8080;
app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});