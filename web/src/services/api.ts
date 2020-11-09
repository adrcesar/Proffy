import axios from 'axios';
import { createBuilderStatusReporter } from 'typescript';

const api = axios.create({
    baseURL: 'http://localhost:8080',
});

export default api;